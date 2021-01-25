FROM python:3.7

# set work directory
ENV PROJECT_ROOT /docker
WORKDIR $PROJECT_ROOT
# set environment variables
ENV PYTHONDONTWRITEBYTECODE 1
ENV PYTHONUNBUFFERED 1
# install dependencies
COPY requirements.txt requirements.txt
RUN pip install -r requirements.txt
COPY . .
CMD python manage.py createsuperuser --username admin --email admin@example.com --noinput
CMD python manage.py changepassword admin
CMD python manage.py runserver 0.0.0.0:8010