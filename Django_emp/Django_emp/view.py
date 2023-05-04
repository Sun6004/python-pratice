from anaconda_navigator.utils.py3compat import request
from django.http import HttpResponse
from django.shortcuts import render
from django.views.decorators.csrf import csrf_exempt
from Django_emp.dao_emp import DaoEmp

def emp(request):
    dao = DaoEmp()
    list = dao.selectList()
    return render(request,'emp_list.html', {'list': list})