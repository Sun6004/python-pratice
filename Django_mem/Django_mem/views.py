from anaconda_navigator.utils.py3compat import request
from django.http import HttpResponse
from django.shortcuts import render
from django.views.decorators.csrf import csrf_exempt
from Django_mem.dao_mem import DaoMem


def mem(request):
    dao = DaoMem()
    list = dao.selectList()
    return render(request,'mem_list.html', {'list': list})

def mem_detail(request):
    e_id = request.GET.get('m_id','')
    dao = DaoMem()
    vo = dao.selectOne(e_id)
    return render(request,'mem_detail.html', {'vo': vo})

def mem_mod(request):
    m_id = request.GET.get('m_id','')    
    dao = DaoMem()
    vo = dao.selectOne(m_id)
    return render(request, 'mem_mod.html', {'vo': vo})

@csrf_exempt
def mem_mod_act(request):
    m_id = request.POST['m_id']   
    m_name = request.POST['m_name']    
    tel = request.POST['tel']
    addr = request.POST['addr'] 
       
    dao = DaoMem()
    cnt = dao.upDate(m_id, m_name, tel, addr)
    return render(request, 'mem_mod_act.html', {'cnt': cnt})

def mem_add(request):
    return render(request, 'mem_add.html')

@csrf_exempt
def mem_add_act(request):
    m_id = request.POST.get('m_id')   
    m_name = request.POST.get('m_name')    
    tel = request.POST.get('tel')
    addr = request.POST.get('addr') 
       
    dao = DaoMem()
    cnt = dao.insert(m_id, m_name, tel, addr)
    return render(request, 'mem_add_act.html', {'cnt': cnt})

@csrf_exempt
def mem_del_act(request):
    m_id = request.POST.get('m_id') 
    dao = DaoMem()
    cnt = dao.delete(m_id)  
    return render(request, 'mem_del_act.html', {'cnt': cnt})

