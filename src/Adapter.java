public class Adapter {

    public SuchErgebniss suche (SuchAuftrag r){
        return new  SuchErgebniss();
    }
    public QueryObject transformIN (SuchAuftrag s){
        return new QueryObject();
    }
    public SuchErgebniss transformOUT (QueryResult q){
        return new SuchErgebniss();
    }
}
