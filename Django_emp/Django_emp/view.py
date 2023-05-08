from anaconda_navigator.utils.py3compat import request
from django.http import HttpResponse
from django.shortcuts import render
from django.views.decorators.csrf import csrf_exempt
from Django_emp.dao_emp import DaoEmp

def emp(request):
    dao = DaoEmp()
    list = dao.selectList()
    return render(request,'emp_list.html', {'list': list})

def emp_detail(request):
    e_id = request.GET.get('e_id','')
    dao = DaoEmp()
    vo = dao.selectOne(e_id)
    return render(request,'emp_detail.html', {'vo': vo})

def emp_mod(request):
    e_id = request.GET.get('e_id','')    
    dao = DaoEmp()
    vo = dao.selectOne(e_id)
    return render(request, 'emp_mod.html', {'vo': vo})

@csrf_exempt
def emp_mod_act(request):
    e_id = request.POST['e_id']   
    e_name = request.POST['e_name']    
    sex = request.POST['sex']
    addr = request.POST['addr'] 
       
    dao = DaoEmp()
    cnt = dao.upDate(e_id, e_name, sex, addr)
    return render(request, 'emp_mod_act.html', {'cnt': cnt})

def emp_add(request):
    return render(request, 'emp_add.html')

@csrf_exempt
def emp_add_act(request):
    e_id = request.POST.get('e_id')   
    e_name = request.POST.get('e_name')    
    sex = request.POST.get('sex')
    addr = request.POST.get('addr') 
       
    dao = DaoEmp()
    cnt = dao.insert(e_id, e_name, sex, addr)
    return render(request, 'emp_add_act.html', {'cnt': cnt})

@csrf_exempt
def emp_del_act(request):
    e_id = request.POST.get('e_id') 
    dao = DaoEmp()
    cnt = dao.delete(e_id)  
    return render(request, 'emp_del_act.html', {'cnt': cnt})

