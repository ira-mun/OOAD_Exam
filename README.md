# OOAD_Exam
Спроектувати логіку автоматичної генерації та оплати рахунків (інвойсів):

Користувач обирає тариф, період оплати (місяць, рік), автоматична/ручна оплата, вводить дані банк.картки (для автоматичної оплати)
Для кожного користувача в залежності від обраного періоду оплати у відповідний день місяця/року формується рахунок згідно із обраним тарифом
При автоматичній оплаті відбувається спроба списання коштів із картки через платіжний сервіс
При невдачі автоматичної оплати відбувається декілька повторних спроб із інтервалом в день
При перевищенні допустимої кількості несплачених рахунків протягом заданого часу відбувається блокування сервісу
Взаємодія із застосунком (точка входу) - HTTP API; всі операції, в т.ч. ті що відбуваються по графіку, вважати такими, що надходять ззовні як API запити ВАЖЛИВО: "Спроектувати" означає написати тільки СХЕМАТИЧНИЙ код, необхідний для ілюстрації ДИЗАЙНУ. Повну робочу реалізацію із зверненнямии до БД, платіжного сервісу тощо створювати НЕ ПОТРІБНО
