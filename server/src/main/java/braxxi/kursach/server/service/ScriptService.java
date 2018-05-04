package braxxi.kursach.server.service;

import braxxi.kursach.commons.entity.Script1;
import braxxi.kursach.commons.entity.Script2;
import braxxi.kursach.commons.entity.ScriptEntity;
import org.springframework.stereotype.Service;

@Service
public class ScriptService {

    private ScriptEntity script1 = Script1.create();
    private ScriptEntity script2 = Script2.create();

    public ScriptEntity getScript1() {
        return script1;
    }

    public ScriptEntity getScript2() {
        return script2;
    }

    public ScriptEntity getScript(int groupId) {
        if (groupId == 1) {
            return getScript1();
        } else if (groupId == 2) {
            return getScript2();
        } else  return null;

    }
}
