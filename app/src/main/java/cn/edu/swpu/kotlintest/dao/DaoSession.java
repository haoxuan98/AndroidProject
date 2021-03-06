package cn.edu.swpu.kotlintest.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import cn.edu.swpu.kotlintest.entity.CourseDB;

import cn.edu.swpu.kotlintest.dao.CourseDBDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig courseDBDaoConfig;

    private final CourseDBDao courseDBDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        courseDBDaoConfig = daoConfigMap.get(CourseDBDao.class).clone();
        courseDBDaoConfig.initIdentityScope(type);

        courseDBDao = new CourseDBDao(courseDBDaoConfig, this);

        registerDao(CourseDB.class, courseDBDao);
    }
    
    public void clear() {
        courseDBDaoConfig.clearIdentityScope();
    }

    public CourseDBDao getCourseDBDao() {
        return courseDBDao;
    }

}
