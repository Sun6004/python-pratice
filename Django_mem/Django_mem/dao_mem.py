import pymysql
from anaconda_project.internal.cli.environment_commands import update

class DaoMem:
    def __init__(self):
        self.conn = pymysql.connect(
            host='localhost',
            user='root',
            password='python',
            db='python',
            charset='utf8',
            port=3305
        )
        self.curs = self.conn.cursor(pymysql.cursors.DictCursor)

    def selectList(self):
        sql = "SELECT * FROM mem"
        self.curs.execute(sql)
        result = self.curs.fetchall()
        return result

    def selectOne(self, e_id):
        sql = "SELECT * FROM mem WHERE m_id = %s"
        self.curs.execute(sql, (e_id,))
        res = self.curs.fetchone()
        return res

    def __del__(self):
        self.curs.close()
        self.conn.close()
        
    def insert(self, m_id, m_name, tel, addr):
        sql = """INSERT INTO mem
                    (e_id, e_name, tel, addr)
                 VALUES
                     (%s,%s,%s,%s)"""
        self.curs.execute(sql, (m_id, m_name, tel, addr))
        self.conn.commit()  # 데이터베이스에 변경 내용 반영
        cnt = self.curs.rowcount  # 삽입된 행 수를 반환
        return cnt
        
    
    def delete(self, m_id):
        sql = "DELETE from mem where m_id=%s;"
        self.curs.execute(sql, (m_id,))
        self.conn.commit()
        cnt = self.curs.rowcount
        return cnt
    
    def upDate(self, m_id, m_name, tel, addr):
        sql = "UPDATE mem SET m_name=%s, tel=%s, addr=%s WHERE m_id=%s;"
        self.curs.execute(sql, (m_name, tel, addr, m_id))
        self.conn.commit()
        cnt = self.curs.rowcount
        return cnt

if __name__ == '__main__':
    de = DaoMem()
    mem_list = de.selectList()
    print("mem_list", mem_list)
    print("\n")
    mem = de.selectOne(1)
    print("mem", mem)
    
    insert_cnt = de.insert()
    print("insert_cnt", insert_cnt)
    
    delete_cnt = de.delete(9)
    
    upDate_cnt = de.upDate(2, 10, 10, 10)

