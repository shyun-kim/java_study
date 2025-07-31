package com.scoremgm.repository;

import java.util.List;
import com.scoremgm.model.MemberVo;

public interface ScoreRepository {
	void remove(String no);
	void update(MemberVo member);
	MemberVo find(String no);
	boolean insert(MemberVo member);
	int getCount();
	List<MemberVo> findAll();
}
