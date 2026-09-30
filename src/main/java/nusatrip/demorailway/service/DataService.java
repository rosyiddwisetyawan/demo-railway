package nusatrip.demorailway.service;

import nusatrip.demorailway.entity.Content;
import nusatrip.demorailway.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    private final ContentRepository contentRepository;

    @Autowired
    public DataService(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    public List<Content> getAllContent() {
        return contentRepository.findAll();
    }
}
