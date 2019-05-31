package com.nsc.brazil.bmteommp;

import com.nsc.brazil.bmteommp.domain.*;
import com.nsc.brazil.bmteommp.repository.*;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Ignore
public class RepositoryTests {
    @Autowired
    private ProjectsRepository projectsRepository;

    @Autowired
    private TransmissionlinesRepository transmissionlinesRepository;
    @Autowired
    private LotsRepository lotsRepository;

    @Autowired
    private TowersRepository towersRepository;

    @Autowired
    private SubstationsRepository substationsRepository;

    @Autowired
    private RegionsRepository regionsRepository;

    @Autowired
    private SubstationequipmentsRepository substationequipmentsRepository;

    @Autowired
    private TowerlandsRepository towerlandsRepository;

    @Autowired
    private LandinfoRepository landinfoRepository;

    @Autowired
    private TowertypelistRepository towertypelistRepository;

    @Autowired
    private FoundationlistRepository foundationlistRepository;


    @Autowired
    private PicturesinfoesRepository picturesinfoesRepository;


    @Autowired
    private ReportRepository reportRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getProjects() {
        List<Projects> lst = projectsRepository.findAll();
        lst.forEach(item -> {
            System.out.println(item.toString());
        });
    }

    @Test
    public void getLines() {
        List<Transmissionlines> lst = transmissionlinesRepository.findAll();
        lst.sort((Transmissionlines arg0, Transmissionlines arg1) -> arg0.getNumber()-arg1.getNumber());
        lst.forEach(item -> {
            System.out.println(item.toString());
        });
    }


    @Test
    public void getLots() {
        Sort sort = new Sort(Sort.Direction.DESC, "Name");
        List<Lots> lst = lotsRepository.findAll(sort);
        lst.sort((Lots arg0, Lots arg1) -> arg0.getNumber()-arg1.getNumber());

        lst.forEach(item -> {
            System.out.println(item.toString());
        });
    }


    @Test
    public void getTowers() {
        List<Towers> lst = towersRepository.findAll();
        lst.sort((Towers arg0, Towers arg1) -> arg0.getNumber()-arg1.getNumber());
        lst.subList(0,10).forEach(item -> {
            System.out.println(item.toString());
        });
    }


    @Test
    public void getSubstations() {
        List<Substations> lst = substationsRepository.findAll();
        lst.sort((Substations arg0, Substations arg1) -> arg0.getNumber()-arg1.getNumber());
        lst.forEach(item -> {
            System.out.println(item.toString());
        });
    }

    @Test
    public void getRegions() {
        List<Regions> lst = regionsRepository.findAll();
        lst.sort((Regions arg0, Regions arg1) -> arg0.getNumber()-arg1.getNumber());
        lst.forEach(item -> {
            System.out.println(item.toString());
        });
    }


    @Test
    public void getSubstationequipments() {
        List<Substationequipments> lst = substationequipmentsRepository.findAll();
        lst.forEach(item -> {
            System.out.println(item.toString());
        });
    }

    @Test
    public void getTowerlands() {
        List<Towerlands> lst = towerlandsRepository.findAll();
        lst.forEach(item -> {
            System.out.println(item.toString());
        });
    }

    @Test
    public void getLandinfo() {
        List<Landinfo> lst = landinfoRepository.findAll();
        lst.forEach(item -> {
            System.out.println(item.toString());
        });
    }


    @Test
    public void getLandinfoByID() {
        String towerlandId = "02ce819d-fce4-4280-bd86-178d65021fd0";
        Optional<Towerlands> towerland = towerlandsRepository.findById(towerlandId);
        if(towerland != null){
            String landCode = towerland.get().getCadastralCode();
            Landinfo info = landinfoRepository.findBypROCESSNUMBER(landCode);
            System.out.println(info.toString());
        }
    }


    @Test
    public void getTowerTypes() {
        List<Towertypelist> lst = towertypelistRepository.findByTowerType("RAM8");
        lst.subList(0,10).forEach(item -> {
            System.out.println(item.toString());
        });
    }


    @Test
    public void getFoudation() {
        List<Foundationlist> lst = foundationlistRepository.findByTowerTypeAndFoundation("RAL8","TCB-2322");
        lst.forEach(item -> {
            System.out.println(item.toString());
        });
    }


    @Test
    public void getRegionPictures() {
        String itemID = "07bc16a6-c5ec-4139-a3de-fcbeb42f02b6";
        List<Picturesinfoes> lst = picturesinfoesRepository.findByItemID(itemID);
//        List<Picturesinfoes> lst = picturesinfoesRepository.findAll();
        lst.forEach(item -> {
            System.out.println(item.toString());
        });
    }

    @Test
    public void getSubstatiopPictures() {
        String substationid = "D92BB214-8328-4BC8-947E-F2ED24F3CE63";
        List<Picturesinfoes> result = new ArrayList<Picturesinfoes>();

        List<Regions> regionsList = regionsRepository.findAll();

        regionsList.forEach(item -> {
            if(item.getSubstationID().equals(substationid)){
                List<Picturesinfoes> lst = picturesinfoesRepository.findByItemID(item.getID());
                result.addAll(lst);
            }
        });

        result.forEach(item -> {
            System.out.println(item.toString());
        });
    }


    @Test
    public void getReport() {
        List<Report> lst = reportRepository.findAll();
        lst.forEach(item -> {
            System.out.println(item.toString());
        });
    }
}
