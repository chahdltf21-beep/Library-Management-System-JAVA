#!/bin/bash

# Ensure Java is installed
if ! command -v java &> /dev/null
then
    echo "Java could not be found. Please install Java."
    exit 1
fi

# Download OpenJML
echo "Downloading OpenJML..."
wget https://github.com/OpenJML/OpenJML/releases/download/v0.10.0/openjml-0.10.0.jar -P $HOME

# Run OpenJML to verify JML annotations
echo "Running OpenJML verification..."

java -jar $HOME/openjml-0.10.0.jar -d . src/main/java/com/knf/dev/librarymanagementsystem/service/BookService.java

# You can add other files as needed:
# java -jar $HOME/openjml-0.10.0.jar -d . src/main/java/com/knf/dev/librarymanagementsystem/service/AuthorService.java

