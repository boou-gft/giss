/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarResulApurMensalDifRequest.java,v 1.1 2017/04/11 14:10:00 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ListarResulApurMensalDifRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:00 $
 */
public class ListarResulApurMensalDifRequest implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeOcorrencias
     */
    private int _qtdeOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeOcorrencias
     */
    private boolean _has_qtdeOcorrencias;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _codPessoaJurid
     */
    private long _codPessoaJurid = 0;

    /**
     * keeps track of state for field: _codPessoaJurid
     */
    private boolean _has_codPessoaJurid;

    /**
     * Field _numSeqUnidOrganizacional
     */
    private int _numSeqUnidOrganizacional = 0;

    /**
     * keeps track of state for field: _numSeqUnidOrganizacional
     */
    private boolean _has_numSeqUnidOrganizacional;

    /**
     * Field _mesAnoApuracao
     */
    private int _mesAnoApuracao = 0;

    /**
     * keeps track of state for field: _mesAnoApuracao
     */
    private boolean _has_mesAnoApuracao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarResulApurMensalDifRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.request.ListarResulApurMensalDifRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodPessoaJurid
     * 
     */
    public void deleteCodPessoaJurid()
    {
        this._has_codPessoaJurid= false;
    } //-- void deleteCodPessoaJurid() 

    /**
     * Method deleteMesAnoApuracao
     * 
     */
    public void deleteMesAnoApuracao()
    {
        this._has_mesAnoApuracao= false;
    } //-- void deleteMesAnoApuracao() 

    /**
     * Method deleteNumSeqUnidOrganizacional
     * 
     */
    public void deleteNumSeqUnidOrganizacional()
    {
        this._has_numSeqUnidOrganizacional= false;
    } //-- void deleteNumSeqUnidOrganizacional() 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'codPessoaJurid'.
     * 
     * @return long
     * @return the value of field 'codPessoaJurid'.
     */
    public long getCodPessoaJurid()
    {
        return this._codPessoaJurid;
    } //-- long getCodPessoaJurid() 

    /**
     * Returns the value of field 'mesAnoApuracao'.
     * 
     * @return int
     * @return the value of field 'mesAnoApuracao'.
     */
    public int getMesAnoApuracao()
    {
        return this._mesAnoApuracao;
    } //-- int getMesAnoApuracao() 

    /**
     * Returns the value of field 'numSeqUnidOrganizacional'.
     * 
     * @return int
     * @return the value of field 'numSeqUnidOrganizacional'.
     */
    public int getNumSeqUnidOrganizacional()
    {
        return this._numSeqUnidOrganizacional;
    } //-- int getNumSeqUnidOrganizacional() 

    /**
     * Returns the value of field 'qtdeOcorrencias'.
     * 
     * @return int
     * @return the value of field 'qtdeOcorrencias'.
     */
    public int getQtdeOcorrencias()
    {
        return this._qtdeOcorrencias;
    } //-- int getQtdeOcorrencias() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasCodPessoaJurid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPessoaJurid()
    {
        return this._has_codPessoaJurid;
    } //-- boolean hasCodPessoaJurid() 

    /**
     * Method hasMesAnoApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAnoApuracao()
    {
        return this._has_mesAnoApuracao;
    } //-- boolean hasMesAnoApuracao() 

    /**
     * Method hasNumSeqUnidOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumSeqUnidOrganizacional()
    {
        return this._has_numSeqUnidOrganizacional;
    } //-- boolean hasNumSeqUnidOrganizacional() 

    /**
     * Method hasQtdeOcorrencias
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeOcorrencias()
    {
        return this._has_qtdeOcorrencias;
    } //-- boolean hasQtdeOcorrencias() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'codPessoaJurid'.
     * 
     * @param codPessoaJurid the value of field 'codPessoaJurid'.
     */
    public void setCodPessoaJurid(long codPessoaJurid)
    {
        this._codPessoaJurid = codPessoaJurid;
        this._has_codPessoaJurid = true;
    } //-- void setCodPessoaJurid(long) 

    /**
     * Sets the value of field 'mesAnoApuracao'.
     * 
     * @param mesAnoApuracao the value of field 'mesAnoApuracao'.
     */
    public void setMesAnoApuracao(int mesAnoApuracao)
    {
        this._mesAnoApuracao = mesAnoApuracao;
        this._has_mesAnoApuracao = true;
    } //-- void setMesAnoApuracao(int) 

    /**
     * Sets the value of field 'numSeqUnidOrganizacional'.
     * 
     * @param numSeqUnidOrganizacional the value of field
     * 'numSeqUnidOrganizacional'.
     */
    public void setNumSeqUnidOrganizacional(int numSeqUnidOrganizacional)
    {
        this._numSeqUnidOrganizacional = numSeqUnidOrganizacional;
        this._has_numSeqUnidOrganizacional = true;
    } //-- void setNumSeqUnidOrganizacional(int) 

    /**
     * Sets the value of field 'qtdeOcorrencias'.
     * 
     * @param qtdeOcorrencias the value of field 'qtdeOcorrencias'.
     */
    public void setQtdeOcorrencias(int qtdeOcorrencias)
    {
        this._qtdeOcorrencias = qtdeOcorrencias;
        this._has_qtdeOcorrencias = true;
    } //-- void setQtdeOcorrencias(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarResulApurMensalDifRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.request.ListarResulApurMensalDifRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.request.ListarResulApurMensalDifRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.request.ListarResulApurMensalDifRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarresulapurmensaldif.request.ListarResulApurMensalDifRequest unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
