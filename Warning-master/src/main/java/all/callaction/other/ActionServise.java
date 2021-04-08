package all.callaction.other;

public class ActionServise {//连接dao层
    ActionDao actionDao=new ActionDao();

    public boolean addaction(Add action){
        boolean isadd=actionDao.addaction(action);
        return isadd;
    }

}
