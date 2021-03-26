from django.views.generic import TemplateView

class HomePageView(TemplateView):
    template_name = 'templates/home.html'

class AboutPageView(TemplateView):
    template_name = 'templates/about.html'