/*
 * �^�C�g���FOracleDataBase�Ƃ̒ʐM
 * ����    �FOracleDataBase�Ƃ̐ڑ��ASQL���̑��M�ƃf�[�^�̎󂯎��A�R�~�b�g�A�ؒf���s��
 *
 * �ύX�����F2016/02/23 Tuesday
 *         �F�V�K�쐬
 *
 */

package dba;

// �C���|�[�g��
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

/**
 * OracleDB�Ƃ̒ʐM�Ɋւ��鏈���Q�ł��B
 *
 * @author Fumihiro Miyazaki
 */
public class DBAccessor{
	// DB�ɐڑ����邽�߂�Connection�^�̃I�u�W�F�N�g
	
	/**
	* OracleDB�ɐڑ����邽�߂̃��\�b�h�ł��B
	*
	* @param 	�Ȃ�
	* @return	void
	*/
	public void connect (){
		/* ��O���L���b�`����\���̂��鏈��
		 *	// OracleDriver�N���X�̃I�u�W�F�N�g�𐶐�
		 *
		 *	// OracleDB�ɐڑ�����
		 *
		 *	// �I�[�g�R�~�b�g�@�\��OFF�ɂ���
		 */
	}

	/**
	* OracleDB����f�[�^��ǂݍ��ނ��邽�߂̃��\�b�h�ł��B
	*
	* @param 	�r�p�k�� sql(String)
	* @return	�\�f�[�^
	*/
	public /*�\�f�[�^*/ read ( /*�r�p�k��*/ ){
		try {
		/* ��O���L���b�`����\���̂��鏈��
		 *	// SQL����DB�ɑ��邽�߂�Statement�I�u�W�F�N�g�𐶐�
		 *
		 *	// SQL�������s���AResultSet�I�u�W�F�N�g�𐶐�
		 *
		 *	// ���������f�[�^��Ԃ�
		 *
		 *	// ��O�����������ꍇ�Anull��Ԃ�
		 */
		}
	}
	
	/**
	* OracleDB�Ƀf�[�^���������ނ��邽�߂̃��\�b�h�ł��B
	*
	* @param 	�r�p�k�� sql(String)
	* @return	void
	*/
	public void write ( /*�r�p�k��*/ ){
		/* ��O���L���b�`����\���̂��鏈��
		 *	// SQL����DB�ɑ��邽�߂�Statement�I�u�W�F�N�g�𐶐�
		 *	
		 *	// SQL�������s
		 *
		 *	// ���ʂ��R�~�b�g
		 */ 
	}

	/**
	* ���s����SQL�����R�~�b�g���邽�߂̃��\�b�h�ł��B
	*
	* @param 	�Ȃ�
	* @return	void
	*/
	public void commit (){
		/* ��O���L���b�`����\���̂��鏈��
		 *	// �R�~�b�g
		 */
	}
	
	/**
	* OracleDB��ؒf���邽�߂̃��\�b�h�ł��B
	*
	* @param 	�Ȃ�
	* @return	void
	*/
	public void close (){
		/* ��O���L���b�`����\���̂��鏈��
		 *	// DB���N���[�Y
		 */
}
// -EOF-