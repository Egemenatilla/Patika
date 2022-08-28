list1 = [[1,'a',['cat'],2],[[[3]],'dog'],4,5]

new_list = []                   # Yeni liste oluşturulması
def flatten(list1):             # Flatten fonksiyonu
    for i in list1:             # list1 içindeki her elemanın kontrolü
        if(type(i)==list):      # Eğer ilk elemanın liste olup olmadığının kontrolü.
            flatten(i)          # Eğer kontrol edilen eleman bir listeyse tekrar fonksiyon çağrılıyor.
        else:
            new_list.append(i)  # Her şey tamamsa yeni listeye eklenmesi

flatten(list1)                  # Fonksiyonun çağırılması

print(new_list)                 # Listenin son halinin yazdırılması.
