import java.util.ArrayList;
import java.util.List;

public class OrderGod {

        public double calculateTotalSum() {return 0.0;}

        public List<Item> getItems() {return new ArrayList<>();}

        public int getItemCount() {return 0;}

        public void addItem(Item item) {/*...*/}

        public void deleteItem(Item item) {/*...*/}

        public void printOrder() {/*...*/}

        public void showOrder() {/*...*/}

        public void load() {/*...*/}

        public void save() {/*...*/}

        public void update() {/*...*/}

        public void delete() {/*...*/}
}

/*---------------APLICANDO S - SOLID-----------*/

class OrderRepository {

    public void load(String orderID) {
        // Implementação para carregar um pedido do banco de dados ou de outra fonte
    }

    public void save(Order order) {
        // Implementação para salvar o pedido no banco de dados ou em outra fonte
    }

    public void update(Order order) {
        // Implementação para atualizar o pedido no banco de dados ou em outra fonte
    }

    public void delete(Order order) {
        // Implementação para deletar o pedido do banco de dados ou de outra fonte
    }
}
class OrderViewer {

    public void printOrder(Order order) {
        // Implementação para imprimir os detalhes do pedido
    }

    public void showOrder(Order order) {
        // Implementação para exibir os detalhes do pedido na interface do usuário ou em outra saída
    }
}
class Order {
    private List<Item> items = new ArrayList<>();

    public double calculateTotalSum() {
        return 0.0;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getItemCount() {
        return items.size();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void deleteItem(Item item) {
        items.remove(item);
    }
}
