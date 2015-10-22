import socket

link_local = socket.gethostbyname(socket.gethostname())
host, aliaslist, lan_ip = socket.gethostbyname_ex(socket.gethostname())
print ("Hostname : " + host)
print ("LAN IP : " + lan_ip[0])
print (" IP : " + link_local)


ip_address = input("10.5.13.220")

"""This part converts to base 10"""
ListA = ip_address.split(".")
ListA = list(map(int, ListA))
ListA = ListA[0]*(256**3) + ListA[1]*(256**2) + ListA[2]*(256**1) + ListA[3]
print("The IP Address in base 10 is: " , ListA)

"""This part converts to base 2"""
base2 = [format(int(x), '08b') for x in ip_address.split('.')]
print("The IP Address in base 2 is: ", base2)

"""This part converts to hex"""
hexIP = []
[hexIP.append(hex(int(x))[2:].zfill(2)) for x in ip_address.split('.')]
hexIP = "".join(hexIP)
print("The IP Address in hex is: " , hexIP)       
