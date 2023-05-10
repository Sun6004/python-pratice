"""
URL configuration for Django_mem project.

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
from Django_mem import views
urlpatterns = [
    path('mem_list', views.mem),
    path('mem_detail', views.mem_detail),
    path('mem_mod', views.mem_mod),
    path('mem_add', views.mem_add),
    path('mem_mod_act', views.mem_mod_act),
    path('mem_add_act', views.mem_add_act),
    path('mem_del_act', views.mem_del_act),
    path('', views.mem),
]
