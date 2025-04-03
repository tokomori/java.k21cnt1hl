package com.k21cnt1.lession11.example.service;

import com.k21cnt1.lession11.example.entity.Nvt;
import com.k21cnt1.lession11.example.repository.NvtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NvtService {
    //Crud
    @Autowired
    private NvtRepository nvtRepository;
    //Lấy toàn bộ sinh viên
    public List<Nvt> getAllStudents() {return nvtRepository.findAll();}
    //Lấy theo id
    public Nvt getStudentById(Long Nvt_id) {return nvtRepository.findById(Nvt_id).orElse(null); }
    //thêm mới
    public Nvt save(Nvt nvt) {return nvtRepository.save(nvt);}
    //Cập nhật
    public Nvt update(Long Nvt_id, Nvt nvt){
        return nvtRepository.findById(Nvt_id).map(stud->{
            stud.setNvt_user(nvt.getNvt_user());
            stud.setNvt_pass(nvt.getNvt_pass());
            stud.setNvt_email(nvt.getNvt_email());
            stud.setNvt_phone(nvt.getNvt_phone());
            stud.setNvt_address(nvt.getNvt_address());
            stud.setNvt_status(nvt.getNvt_status());
            return nvtRepository.save(stud);
        })
                .orElse(null);
    }
    //Xóa
    public void delete(Long Nvt_id) {nvtRepository.deleteById(Nvt_id);}
}
