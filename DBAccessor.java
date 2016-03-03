/*
 * タイトル：OracleDataBaseとの通信
 * 説明    ：OracleDataBaseとの接続、SQL文の送信とデータの受け取り、コミット、切断を行う
 *
 * 変更履歴：2016/02/23 Tuesday
 *         ：新規作成
 *
 */

package dba;

// インポート文
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

/**
 * OracleDBとの通信に関する処理群です。
 *
 * @author Fumihiro Miyazaki
 */
public class DBAccessor{
	// DBに接続するためのConnection型のオブジェクト
	
	/**
	* OracleDBに接続するためのメソッドです。
	*
	* @param 	なし
	* @return	void
	*/
	public void connect (){
		/* 例外をキャッチする可能性のある処理
		 *	// OracleDriverクラスのオブジェクトを生成
		 *
		 *	// OracleDBに接続する
		 *
		 *	// オートコミット機能をOFFにする
		 */
	}

	/**
	* OracleDBからデータを読み込むするためのメソッドです。
	*
	* @param 	ＳＱＬ文 sql(String)
	* @return	表データ
	*/
	public /*表データ*/ read ( /*ＳＱＬ文*/ ){
		try {
		/* 例外をキャッチする可能性のある処理
		 *	// SQL文をDBに送るためのStatementオブジェクトを生成
		 *
		 *	// SQL文を実行し、ResultSetオブジェクトを生成
		 *
		 *	// 生成したデータを返す
		 *
		 *	// 例外が発生した場合、nullを返す
		 */
		}
	}
	
	/**
	* OracleDBにデータを書き込むするためのメソッドです。
	*
	* @param 	ＳＱＬ文 sql(String)
	* @return	void
	*/
	public void write ( /*ＳＱＬ文*/ ){
		/* 例外をキャッチする可能性のある処理
		 *	// SQL文をDBに送るためのStatementオブジェクトを生成
		 *	
		 *	// SQL文を実行
		 *
		 *	// 結果をコミット
		 */ 
	}

	/**
	* 実行したSQL文をコミットするためのメソッドです。
	*
	* @param 	なし
	* @return	void
	*/
	public void commit (){
		/* 例外をキャッチする可能性のある処理
		 *	// コミット
		 */
	}
	
	/**
	* OracleDBを切断するためのメソッドです。
	*
	* @param 	なし
	* @return	void
	*/
	public void close (){
		/* 例外をキャッチする可能性のある処理
		 *	// DBをクローズ
		 */
}
// -EOF-