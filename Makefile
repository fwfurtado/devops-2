IMAGE_NAME=devops-2

build/test:
	$(info testing application)
	@ sh gradlew test

build/package: build/test
	$(info packaging application)
	@ sh gradlew build -x test

build/docker: build/package
	$(info packaging application)
	@ docker image build -t $(IMAGE_NAME) .

build/deploy/staging:
	$(info deploy to heroku staging)
	@ echo "heroku deploy"

build/deploy/production:
	$(info deploy to heroku)
	@ echo "heroku deploy"