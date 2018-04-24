package braxxi.kursach.server.service;

import braxxi.kursach.commons.entity.Script1;
import braxxi.kursach.commons.entity.ScriptEntity;
import org.springframework.stereotype.Service;

@Service
public class ScriptService {

    private ScriptEntity script1 = Script1.create();

    public ScriptEntity getScript1() {
        return script1;
    }

}
