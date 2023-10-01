package com.javaee.demo.service.com.javaee.demo.service.impl;

import com.javaee.demo.mapper.PublisherMapper;
import com.javaee.demo.po.Publisher;
import com.javaee.demo.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT, readOnly = true)
public class PublisherServiceImpl implements PublisherService {
    @Autowired
    private PublisherMapper publisherMapper;
    public List<Publisher> findPublishers() {
        return publisherMapper.findPublishers();
    }
}
