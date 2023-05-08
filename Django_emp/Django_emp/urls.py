"""
URL configuration for Django_emp project.

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/4.2/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path
from Django_emp import view

urlpatterns = [
    path('emp_list', view.emp),
    path('emp_detail', view.emp_detail),
    path('emp_mod', view.emp_mod),
    path('emp_add', view.emp_add),
    path('emp_mod_act', view.emp_mod_act),
    path('emp_add_act', view.emp_add_act),
    path('emp_del_act', view.emp_del_act),
    path('', view.emp),
]
