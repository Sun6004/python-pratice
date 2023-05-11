from anaconda_navigator.utils.py3compat import request
from django.http import HttpResponse
from django.http import JsonResponse
from django.http.response import HttpResponseBadRequest
from django.shortcuts import render
from django.views.decorators.csrf import csrf_exempt
from flask import json
from Django_mvvm.dao_emp import DaoEmp


def index(request):
    return render(request,'index.html')

@csrf_exempt
def ajax(request):
    param = json.loads(request.body)
    print("param",param["menu"])
    context = {
        'result': 'ok'
    }
    return JsonResponse(context)

@csrf_exempt
def ajax_emp_list(request):
    dao = DaoEmp()
    list = dao.selectList()
    context = {
        'list': list
        }
    return JsonResponse(context)

@csrf_exempt
def ajax_emp_detail(request):
    e_id = request.POST['e_id']
    dao = DaoEmp()
    vo = dao.selectOne(e_id)
    context = {
        'vo': vo
        }
    return JsonResponse(context)

@csrf_exempt
def ajax_emp_update(request):
    e_id = request.POST['e_id']
    e_name = request.POST['e_name']    
    sex = request.POST['sex']
    addr = request.POST['addr'] 
    
    dao = DaoEmp()
    cnt = dao.upDate(e_id, e_name, sex, addr)
    context = {
        'cnt': cnt
        }
    return JsonResponse(context)