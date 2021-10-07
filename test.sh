#!/bin/zsh

function testAddStudent {
  BODY=$(cat <<EOF
{
  "name": "Bilal",
  "email": "example@example.com",
  "dob": "2000-01-08"
}
EOF
)
  curl -X POST -H "Content-Type: application/json" -d "$BODY" http://localhost:8080/api/v1/student 
}

function testGetStudents {
  curl -X GET http://localhost:8080/api/v1/student | jq
}

###################################################################

testAddStudent
#testGetStudents
