# Hello java in docker

## minimal setup for a java running in a docker container, it just returns "hello"

- Build the Dockerfile into an image
`docker build -t hello:latest .`

- List images
`docker images`
```
REPOSITORY TAG    IMAGE ID       CREATED          SIZE
hello      latest df074f3dbdfd   7 minutes ago    643
```


- Run the created container 
`docker run hello:latest`

- Should see
```
HELLO
```	
