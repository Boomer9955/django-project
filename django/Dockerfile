FROM python:3.9

# set work directory
ENV PROJECT_ROOT /django
WORKDIR $PROJECT_ROOT
# set environment variables
ENV PYTHONDONTWRITEBYTECODE 1
ENV PYTHONUNBUFFERED 1
# install dependencies
COPY requirements.txt requirements.txt
RUN pip3 install -r requirements.txt
COPY . .
CMD python3 manage.py migrate
CMD python3 manage.py runserver 0.0.0.0:8010