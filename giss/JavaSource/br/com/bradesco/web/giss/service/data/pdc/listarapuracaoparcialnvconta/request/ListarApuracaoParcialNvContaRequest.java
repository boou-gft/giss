/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarApuracaoParcialNvContaRequest.java,v 1.1 2018/05/21 14:33:52 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class ListarApuracaoParcialNvContaRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2018/05/21 14:33:52 $
 */
public class ListarApuracaoParcialNvContaRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _qtdeRegistros
     */
    private int _qtdeRegistros = 0;

    /**
     * keeps track of state for field: _qtdeRegistros
     */
    private boolean _has_qtdeRegistros;

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
     * Field _numSeqUnidOrgnz
     */
    private int _numSeqUnidOrgnz = 0;

    /**
     * keeps track of state for field: _numSeqUnidOrgnz
     */
    private boolean _has_numSeqUnidOrgnz;

    /**
     * Field _codGrupo
     */
    private int _codGrupo = 0;

    /**
     * keeps track of state for field: _codGrupo
     */
    private boolean _has_codGrupo;

    /**
     * Field _codSubGrupo
     */
    private int _codSubGrupo = 0;

    /**
     * keeps track of state for field: _codSubGrupo
     */
    private boolean _has_codSubGrupo;

    /**
     * Field _dataInicial
     */
    private java.lang.String _dataInicial;

    /**
     * Field _dataFinal
     */
    private java.lang.String _dataFinal;

    /**
     * Field _cosif
     */
    private java.lang.String _cosif;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarApuracaoParcialNvContaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.request.ListarApuracaoParcialNvContaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodGrupo
     * 
     */
    public void deleteCodGrupo()
    {
        this._has_codGrupo= false;
    } //-- void deleteCodGrupo() 

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
     * Method deleteCodSubGrupo
     * 
     */
    public void deleteCodSubGrupo()
    {
        this._has_codSubGrupo= false;
    } //-- void deleteCodSubGrupo() 

    /**
     * Method deleteNumSeqUnidOrgnz
     * 
     */
    public void deleteNumSeqUnidOrgnz()
    {
        this._has_numSeqUnidOrgnz= false;
    } //-- void deleteNumSeqUnidOrgnz() 

    /**
     * Method deleteQtdeRegistros
     * 
     */
    public void deleteQtdeRegistros()
    {
        this._has_qtdeRegistros= false;
    } //-- void deleteQtdeRegistros() 

    /**
     * Returns the value of field 'codGrupo'.
     * 
     * @return int
     * @return the value of field 'codGrupo'.
     */
    public int getCodGrupo()
    {
        return this._codGrupo;
    } //-- int getCodGrupo() 

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
     * Returns the value of field 'codSubGrupo'.
     * 
     * @return int
     * @return the value of field 'codSubGrupo'.
     */
    public int getCodSubGrupo()
    {
        return this._codSubGrupo;
    } //-- int getCodSubGrupo() 

    /**
     * Returns the value of field 'cosif'.
     * 
     * @return String
     * @return the value of field 'cosif'.
     */
    public java.lang.String getCosif()
    {
        return this._cosif;
    } //-- java.lang.String getCosif() 

    /**
     * Returns the value of field 'dataFinal'.
     * 
     * @return String
     * @return the value of field 'dataFinal'.
     */
    public java.lang.String getDataFinal()
    {
        return this._dataFinal;
    } //-- java.lang.String getDataFinal() 

    /**
     * Returns the value of field 'dataInicial'.
     * 
     * @return String
     * @return the value of field 'dataInicial'.
     */
    public java.lang.String getDataInicial()
    {
        return this._dataInicial;
    } //-- java.lang.String getDataInicial() 

    /**
     * Returns the value of field 'numSeqUnidOrgnz'.
     * 
     * @return int
     * @return the value of field 'numSeqUnidOrgnz'.
     */
    public int getNumSeqUnidOrgnz()
    {
        return this._numSeqUnidOrgnz;
    } //-- int getNumSeqUnidOrgnz() 

    /**
     * Returns the value of field 'qtdeRegistros'.
     * 
     * @return int
     * @return the value of field 'qtdeRegistros'.
     */
    public int getQtdeRegistros()
    {
        return this._qtdeRegistros;
    } //-- int getQtdeRegistros() 

    /**
     * Method hasCodGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodGrupo()
    {
        return this._has_codGrupo;
    } //-- boolean hasCodGrupo() 

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
     * Method hasCodSubGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodSubGrupo()
    {
        return this._has_codSubGrupo;
    } //-- boolean hasCodSubGrupo() 

    /**
     * Method hasNumSeqUnidOrgnz
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumSeqUnidOrgnz()
    {
        return this._has_numSeqUnidOrgnz;
    } //-- boolean hasNumSeqUnidOrgnz() 

    /**
     * Method hasQtdeRegistros
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdeRegistros()
    {
        return this._has_qtdeRegistros;
    } //-- boolean hasQtdeRegistros() 

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
     * Sets the value of field 'codGrupo'.
     * 
     * @param codGrupo the value of field 'codGrupo'.
     */
    public void setCodGrupo(int codGrupo)
    {
        this._codGrupo = codGrupo;
        this._has_codGrupo = true;
    } //-- void setCodGrupo(int) 

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
     * Sets the value of field 'codSubGrupo'.
     * 
     * @param codSubGrupo the value of field 'codSubGrupo'.
     */
    public void setCodSubGrupo(int codSubGrupo)
    {
        this._codSubGrupo = codSubGrupo;
        this._has_codSubGrupo = true;
    } //-- void setCodSubGrupo(int) 

    /**
     * Sets the value of field 'cosif'.
     * 
     * @param cosif the value of field 'cosif'.
     */
    public void setCosif(java.lang.String cosif)
    {
        this._cosif = cosif;
    } //-- void setCosif(java.lang.String) 

    /**
     * Sets the value of field 'dataFinal'.
     * 
     * @param dataFinal the value of field 'dataFinal'.
     */
    public void setDataFinal(java.lang.String dataFinal)
    {
        this._dataFinal = dataFinal;
    } //-- void setDataFinal(java.lang.String) 

    /**
     * Sets the value of field 'dataInicial'.
     * 
     * @param dataInicial the value of field 'dataInicial'.
     */
    public void setDataInicial(java.lang.String dataInicial)
    {
        this._dataInicial = dataInicial;
    } //-- void setDataInicial(java.lang.String) 

    /**
     * Sets the value of field 'numSeqUnidOrgnz'.
     * 
     * @param numSeqUnidOrgnz the value of field 'numSeqUnidOrgnz'.
     */
    public void setNumSeqUnidOrgnz(int numSeqUnidOrgnz)
    {
        this._numSeqUnidOrgnz = numSeqUnidOrgnz;
        this._has_numSeqUnidOrgnz = true;
    } //-- void setNumSeqUnidOrgnz(int) 

    /**
     * Sets the value of field 'qtdeRegistros'.
     * 
     * @param qtdeRegistros the value of field 'qtdeRegistros'.
     */
    public void setQtdeRegistros(int qtdeRegistros)
    {
        this._qtdeRegistros = qtdeRegistros;
        this._has_qtdeRegistros = true;
    } //-- void setQtdeRegistros(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarApuracaoParcialNvContaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.request.ListarApuracaoParcialNvContaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.request.ListarApuracaoParcialNvContaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.request.ListarApuracaoParcialNvContaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialnvconta.request.ListarApuracaoParcialNvContaRequest unmarshal(java.io.Reader) 

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
