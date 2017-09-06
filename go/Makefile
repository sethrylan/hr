.PHONY: build doc fmt lint run test vet

GOPATH := ${PWD}
export GOPATH

default: build

build: vet
	go build -v -o ./bin/hr ./src/hrm

doc:
	godoc -http=:6060 -index

# http://golang.org/cmd/go/#hdr-Run_gofmt_on_package_sources
fmt:
	go fmt hr main

# https://github.com/golang/lint
lint:
	./bin/golint hr hrm

run: build
	./bin/hr

test:
	go test -cover -v ./test/...

vet:
	go vet hr hrm
