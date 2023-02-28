public class Main {
    public static void main(String[] args) {
        //TODO HOME WORK #13
//        Cиздердин ноутбуктун характеристикасы:
//
//        Төмөнкү объектилер үчүн класстарды түзүңүз:
//
//        Компьютер
//                - Дисплей
//                - Марка
//                - Цвет
//                - Жесткий диск/или SSD
//                - Оперативная память
//                - Видео карта
//                - USB порты (Массив портов)
//                - Клавиатура
//
//        Дисплей
//                - Диагональ
//                - Производитель
//                - Тип матрицы
//
//        Жесткий диск/SSD
//                - Объем памяти
//                - На сколько дисков разделен
//
//        Оперативная память
//        - Объем
//                - Производитель
//
//        USB порт
//        - Тип порта (2.0 или 3.0)
//        - id порта
//
//
//                Клавиатура
//        - Подсветкасы барбы жокбу
//        - Допольнительный цифралар барбы он жагында
//        ----------------------------------------------------------------------------------------------------
//                Баардык класстар үчүн конструкторлорду түзүңүз (баардык поля)
//        Компьютериңизди сүрөттөгөн бир компьютер объектисин түзүңүз.
//
//        PS: Дисплей, жестский диск, оперативная память,  usb port,  баары өзүнчө класс болуш керек
//        объектилерин мейн класстан түзөсүздөр.

        System.out.println("~~~~~~~~~~~Keyboard~~~~~~~~~~");
        Keyboard keyboard = new Keyboard("Подсветка есть?: { Есть }:  ","Дополнительные цифры есть?: { Есть }");
        System.out.println(keyboard.getBacklight()+keyboard.getAdditionalDigits());

        System.out.println("~~~~~~~~~~~USBPort~~~~~~~~~~~");
        USBPort usbPort = new USBPort("Тип порта: { 3.0 }:  ","ID Порта: { 12345 }");
        System.out.println(usbPort.getPortType()+usbPort.getIdPort());

        System.out.println("~~~~~~~~~~~RAM~~~~~~~~~~~");
        RAM ram = new RAM("Оперативная память: { 16gb }:  ","Производство: { Europa }");
        System.out.println(ram.getVolume()+ram.getManufacturer());

        System.out.println("~~~~~~~~~~~SSD~~~~~~~~~~~");
        SSD ssd = new SSD("Объем SSD памяти: { 512gb }:  ","На сколько дисков разделён ваш SSD память: { 2 }: ");
        System.out.println(ssd.getMemory()+ssd.getDisk());

        System.out.println("~~~~~~~~~~~Display~~~~~~~~~~~~~");
        Display display = new Display("Диоганаль дисплея: { 15.6 }:  ","Производиьель дисплея: { China }","Тип матрицы: { TN }");
        System.out.println(display.getDiagonal()+display.getManufacturer()+display.getMatrixType());

        System.out.println("~~~~~~~~~~Computer~~~~~~~~~~~~~");
        Computer computer = new Computer("Дисплей: { 1410 }: ","Марка: { Acer }: ","Цвет: { Black }: ","Видео карта: { Intel® UHD Graphics }");
        System.out.println(computer.getDisplay()+computer.getBrand()+computer.getColor()+computer.getVideoCard());
    }
}