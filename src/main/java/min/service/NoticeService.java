package min.service;

import java.util.List;

import min.domain.Notice;
import min.domain.NoticeSearchDto;

public interface NoticeService {

	//noticeList View
	public List<Notice> noticeListView(NoticeSearchDto searchDto) throws Exception;

	//noticeNewInsertForm
	public void noticeNewInsertForm(Notice noticeDto) throws Exception;

	//noticeNewInert
	public void noticeNewInsert(Notice noticeDto) throws Exception;

	//noticeDetailView
	public Notice noticeDetailView(Notice noticeDto) throws Exception;

	//noticeEdit
	public void noticeContentEdit(Notice noticeDto) throws Exception;

	//noticeDelete
	public void noticeContentDelete(Notice noticeDto) throws Exception;
}
