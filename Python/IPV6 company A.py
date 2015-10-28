def get_ip_6(host,port=0):

    import socket
    IPv6 = socket.socket(socket.AF_INET6, socket.SOCK_STREAM)
    result = socket.getaddrinfo(host,port, AF_INET6)
    return result


