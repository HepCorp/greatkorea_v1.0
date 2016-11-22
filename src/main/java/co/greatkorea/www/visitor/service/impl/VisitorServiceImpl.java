package co.greatkorea.www.visitor.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import co.greatkorea.www.visitor.service.VisitorDAO;
import co.greatkorea.www.visitor.service.VisitorService;
import co.greatkorea.www.visitor.service.VisitorVO;

@Service("visitService")
public class VisitorServiceImpl implements VisitorService {
	
	@Resource(name="visitorDAO")
	VisitorDAO dao;

	/**
	 * 방명록 목록
	 * @param vo - 조회할 정보가 담긴 VisitorVO
	 * @return VisitorVO
	 * @exception Exception
	 */
	@Override
	public List<VisitorVO> selectAll(VisitorVO vo) throws Exception {
		return dao.selectAll();
	}

	/**
	 * 방명록 목록 총갯수
	 * @param vo - 없음
	 * @return int
	 * @exception Exception
	 */
	@Override
	public int selectTot() throws Exception {
		return dao.selectTot();
	}

}
