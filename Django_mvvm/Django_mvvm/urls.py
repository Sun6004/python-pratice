"""
URL configuration for Django_mvvm project.

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
from Django_mvvm import view

urlpatterns = [
    path('admin/', admin.site.urls),
    path('/index', view.index),
    path('', view.index),
    path('ajax', view.ajax),
    path('ajax_emp_list', view.ajax_emp_list),
    path('ajax_emp_detail', view.ajax_emp_detail),
    path('ajax_emp_update', view.ajax_emp_update),
    path('ajax_emp_delete', view.ajax_emp_delete),
    path('ajax_emp_insert', view.ajax_emp_insert),
]