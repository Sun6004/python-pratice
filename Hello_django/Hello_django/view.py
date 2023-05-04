from django.shortcuts import render
from django.http import HttpResponse
from anaconda_navigator.utils.py3compat import request
from django.views.decorators.csrf import csrf_exempt
from .dao_emp import DaoEmp

def hello(request):
    return HttpResponse("Hello, World!")

def param(request):
    menu = request.GET.get('menu','탕수육')
    return HttpResponse("param:{}".format(menu))

@csrf_exempt
def post(request):
    menu = request.POST['menu']
    return HttpResponse("post:{}".format(menu))

def forw(request):
    a = "hong"
    b = ['kim', 'park', 'jodan']
    c = [
        {'e_id':'1', 'e_name':'1', 'sex':'1', 'addr':'1'},
        {'e_id':'2', 'e_name':'2', 'sex':'2', 'addr':'2'},
        {'e_id':'3', 'e_name':'3', 'sex':'3', 'addr':'3'}
        ]
    context = {'a': a, 'b': b, 'c':c }
    return render(request,'forw.html', context)

def emp(request):
    dao = DaoEmp()
    list = dao.selectList()
    return render(request,'emp.html', {'list': list})