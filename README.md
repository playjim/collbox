# collbox

1) эмулятор- генерирует  случайные значения случайных датчиков на случайных контейнерах (датчик температуры, удар, влажности и тп) и отправляет их на rest модуля 2  
2) sensor-request-manager  
Принимает данные от датчиков по ресту и отправляет их в кафку  
3) processor  
Принимает данные из кафки и сохраняет в postgres  
4) web-api  
Реализует рест сервис отдающий по ид/типу датчика список значений с постраничной загрузкой из бд  
