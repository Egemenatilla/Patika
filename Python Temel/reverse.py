l = [[1, 2], [3, 4], [5, 6, 7]]

def reverse (list1):                  # Reverse Fonksiyonu
    new_list =[]                      # İşlem yapılan elemanların ekleneceği liste
    a = len(list1)                    # Fonksiyona gönderilen listenin uzunluğunun bulunması
    for i in range (a-1,-1,-1):       
        
        l = list(reversed(list1[i]))  # Elemanların ters çevrilmesi
        
        new_list.append(l)            # Ters çevrilen elemanların yeni listeye eklenmesi
        
    return new_list                   # Listenin son halinin return edilmesi
    
print(reverse(l)) 
