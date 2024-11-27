public class Dip {

    /*ACOPLAMENMTO*/

    class MySQLConnection {
        public MySQLConnection() {
            // Código para iniciar uma conexão com o banco de dados
        }
    }
    class PasswordReminder {
        private MySQLConnection dbConnection;

        public PasswordReminder() {
            this.dbConnection = new MySQLConnection();
            // O construtor instancia a conexão com o banco de dados
        }

        // Métodos adicionais que usam dbConnection para realizar tarefas específicas
    }

}
/*REFATORACAO*/
class MySQLConnection {
    public MySQLConnection() {
        // Código para configurar a conexão com o banco de dados
    }
}
class PasswordReminder {
    private MySQLConnection dbConnection;

    public PasswordReminder(MySQLConnection dbConnection) {
        this.dbConnection = dbConnection;
        // A conexão é passada para o construtor e armazenada como uma propriedade privada
    }

    // Métodos adicionais que utilizam dbConnection para executar operações no banco
}
class Application {
    public static void main(String[] args) {
        MySQLConnection connection = new MySQLConnection(); // Cria a conexão
        PasswordReminder passwordReminder = new PasswordReminder(connection); // Injeta a conexão

        // Aqui, passwordReminder pode ser usado para executar suas operações
    }
}

/*APPLICANDO O D DO SOLID*/
class DSolic {

    interface DBConnectionInterface {
        void connect();
    }

    class MySQLConnectionD implements DBConnectionInterface {
        @Override
        public void connect() {
            // Lógica para conectar ao MySQL
        }
    }

    class OracleConnection implements DBConnectionInterface {
        @Override
        public void connect() {
            // Lógica para conectar ao Oracle
        }
    }

    class SQLServer implements DBConnectionInterface {
        @Override
        public void connect() {
            // Lógica para conectar ao SQL Server
        }
    }

    class PasswordReminderD {
        private DBConnectionInterface dbConnection;

        PasswordReminderD(DBConnectionInterface dbConnection) {
            this.dbConnection = dbConnection;
        }

        // Outros métodos que utilizam dbConnection para realizar operações

        class Main {
            public void main(String[] args) {
                DBConnectionInterface mysqlConnection = new MySQLConnectionD();
                PasswordReminderD reminder = new PasswordReminderD(mysqlConnection);
                reminder.dbConnection.connect();  // Exemplo de chamada de método

                // Ou com Oracle
                DBConnectionInterface oracleConnection = new OracleConnection();
                reminder = new PasswordReminderD(oracleConnection);
                reminder.dbConnection.connect();

                // Ou com SQL Server
                DBConnectionInterface sqlServerConnection = new SQLServer();
                reminder = new PasswordReminderD(sqlServerConnection);
                reminder.dbConnection.connect();
            }
        }
    }
}