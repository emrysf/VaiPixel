package com.emrys.vaipixel.mapper;

import com.emrys.vaipixel.db.mapper.UserMapper;
import com.emrys.vaipixel.db.mapper.WorkMapper;
import com.emrys.vaipixel.db.model.Work;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PhotoMapperTest {

    @Autowired
    private WorkMapper workMapper;

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testQuery() {
        List<Work> all = workMapper.getAll();
        for (Work work : all) {
            System.out.println(work);
        }
    }

}
