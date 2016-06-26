package ngdemo.dao;

import ngdemo.model.entity.Player;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Daniel on 2015-10-14.
 */
@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class PlayerDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public Player getPlayerByUsername(String username) {
        Session session = sessionFactory.getCurrentSession();
        List players = session.createQuery("from tblplayer where username='" + username +"'").list();
        if (!players.isEmpty()) {
            return (Player) players.get(0);
        }
        return null;
    }
}
