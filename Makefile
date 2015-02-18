all: dependencies test

test:
	sbt test

dependencies:
	which sbt

.PHONY: all dependencies test
