@Entity : It is used for java class that is mapped to a database table.

@Id: Indicates Primary key

@GeneratedValue : value will be generated and managed by the database.

@Repository: 
-> It is a specialized annotation of @Component annotation 
-> It is used to encasulate the logics required to access data sources.
-> It is also used for exception translation.(converting database specific exception into spring DataAccesException)  or (Check exception into unchecked exception).

@Transactional:
-> It is used to manage transcations in spring.
-> It helps in data consistency and integrity.
