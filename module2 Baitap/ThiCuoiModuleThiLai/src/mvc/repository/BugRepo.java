package mvc.repository;

import mvc.model.Bug;
import mvc.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class BugRepo implements IBugRepo {
    static List<String> mucDoNguyHaiList = new ArrayList<>();
    List<Bug> bugList = ReadAndWriteFile.readFile();

    static {
        mucDoNguyHaiList.add("Critical");
        mucDoNguyHaiList.add("Major");
        mucDoNguyHaiList.add("Medium");
        mucDoNguyHaiList.add("Low");
    }

    @Override
    public List<Bug> display() {
        return ReadAndWriteFile.readFile();
    }

    @Override
    public void add(Bug bug) {
        bugList.add(bug);
        ReadAndWriteFile.writeFile(bugList, false);
    }

    @Override
    public List<String> optionMucDoNguyHai() {
        return mucDoNguyHaiList;
    }
}
