package com.nk.springbootsecuritywithdatabase.dao.impl;

import com.nk.springbootsecuritywithdatabase.common.TopicRepository;
import com.nk.springbootsecuritywithdatabase.dao.TopicDAO;
import com.nk.springbootsecuritywithdatabase.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Repository
public class TopicDAOImpl implements TopicDAO {

//	@PersistenceContext
//	private EntityManager entityManager;

    @Autowired
    private TopicRepository repository;

    @Override
    public Topic getTopicById(int topicId) {
        //	return entityManager.find(Topic.class, topicId);
        return repository.findById(topicId).orElse(null);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Topic> getAllTopics() {
//        String HQL = "from Topic  t ORDER BY t.topicId";
//        return (List<Topic>) entityManager.createQuery(HQL).getResultList();
//
        return (List<Topic>) repository.findAll();
    }

    @Override
    public void addTopic(Topic topic) {
       // entityManager.persist(topic);
        repository.save(topic);
    }

	@Override
	public void updateTopic(Topic topic) {
		Topic topicFromDb = getTopicById(topic.getTopicId());
		if(topicFromDb != null){
			topicFromDb.setTitle(topic.getTitle());
			topicFromDb.setCategory(topic.getCategory());
			//entityManager.flush();
		}else{
			System.out.println("Topic doesn't exist which u want update.");
		}
	}

	@Override
	public void deleteTopic(int topicId) {
		Topic topic = getTopicById(topicId);
		if(topic != null)
		//entityManager.remove(topic);
		    repository.delete(topic);
		else
			System.out.println("Topic doesn't exist which u want delete.");
	}
//	@Override
//	public boolean topicExists(String title, String category) {
//		String hql = "FROM Topic as t WHERE t.title = ? and t.category = ?";
//		int count = entityManager.createQuery(hql).setParameter(1, title)
//		              .setParameter(2, category).getResultList().size();
//		return count > 0 ? true : false;
//	}
}
