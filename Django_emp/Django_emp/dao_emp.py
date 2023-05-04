import pymysql
from anaconda_project.internal.cli.environment_commands import update

class DaoEmp:
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
        sql = "SELECT * FROM emp"
        self.curs.execute(sql)
        result = self.curs.fetchall()
        return result

    def selectOne(self, e_id):
        sql = "SELECT * FROM emp WHERE e_id = %s"
        self.curs.execute(sql, (e_id,))
        res = self.curs.fetchone()
        return res

    def __del__(self):
        self.curs.close()
        self.conn.close()
        
    def insert(self):
        sql = """INSERT INTO emp
                    (e_id, e_name, sex, addr)
                 VALUES
                     (%s,%s,%s,%s)"""
        self.curs.execute(sql, ('9','9','9','9'))
        self.conn.commit()  # 데이터베이스에 변경 내용 반영
        cnt = self.curs.rowcount  # 삽입된 행 수를 반환
        return cnt           
    
    def delete(self, e_id):
        sql = "DELETE from emp where e_id=%s;"
        self.curs.execute(sql, (e_id,))
        self.conn.commit()
        cnt = self.curs.rowcount
        return cnt
    
    def upDate(self, e_id, e_name, sex, addr):
        sql = "UPDATE emp SET e_name=%s, sex=%s, addr=%s WHERE e_id=%s;"
        self.curs.execute(sql, (e_name, sex, addr, e_id))
        self.conn.commit()
        cnt = self.curs.rowcount
        return cnt

if __name__ == '__main__':
    de = DaoEmp()
    emp_list = de.selectList()
    print("emp_list", emp_list)
    print("\n")
    emp = de.selectOne(1)
    print("emp", emp)
    
    insert_cnt = de.insert()
    print("insert_cnt", insert_cnt)
    
    delete_cnt = de.delete(9)
    
    upDate_cnt = de.upDate(2, 10, 10, 10)

