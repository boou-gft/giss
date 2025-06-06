/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaExcluirCodLancamento.java,v 1.1 2017/07/06 14:31:58 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request;

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
 * Class ListaExcluirCodLancamento.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/07/06 14:31:58 $
 */
public class ListaExcluirCodLancamento implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codLancamento
     */
    private int _codLancamento = 0;

    /**
     * keeps track of state for field: _codLancamento
     */
    private boolean _has_codLancamento;

    /**
     * Field _complementar
     */
    private java.lang.String _complementar;

    /**
     * Field _cosif
     */
    private long _cosif = 0;

    /**
     * keeps track of state for field: _cosif
     */
    private boolean _has_cosif;

    /**
     * Field _grupo
     */
    private int _grupo = 0;

    /**
     * keeps track of state for field: _grupo
     */
    private boolean _has_grupo;

    /**
     * Field _subGrupo
     */
    private int _subGrupo = 0;

    /**
     * keeps track of state for field: _subGrupo
     */
    private boolean _has_subGrupo;

    /**
     * Field _conta
     */
    private long _conta = 0;

    /**
     * keeps track of state for field: _conta
     */
    private boolean _has_conta;

    /**
     * Field _digito
     */
    private java.lang.String _digito;

    /**
     * Field _nomeConta
     */
    private java.lang.String _nomeConta;

    /**
     * Field _codItem
     */
    private int _codItem = 0;

    /**
     * keeps track of state for field: _codItem
     */
    private boolean _has_codItem;

    /**
     * Field _numParam
     */
    private int _numParam = 0;

    /**
     * keeps track of state for field: _numParam
     */
    private boolean _has_numParam;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaExcluirCodLancamento() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItem
     * 
     */
    public void deleteCodItem()
    {
        this._has_codItem= false;
    } //-- void deleteCodItem() 

    /**
     * Method deleteCodLancamento
     * 
     */
    public void deleteCodLancamento()
    {
        this._has_codLancamento= false;
    } //-- void deleteCodLancamento() 

    /**
     * Method deleteConta
     * 
     */
    public void deleteConta()
    {
        this._has_conta= false;
    } //-- void deleteConta() 

    /**
     * Method deleteCosif
     * 
     */
    public void deleteCosif()
    {
        this._has_cosif= false;
    } //-- void deleteCosif() 

    /**
     * Method deleteGrupo
     * 
     */
    public void deleteGrupo()
    {
        this._has_grupo= false;
    } //-- void deleteGrupo() 

    /**
     * Method deleteNumParam
     * 
     */
    public void deleteNumParam()
    {
        this._has_numParam= false;
    } //-- void deleteNumParam() 

    /**
     * Method deleteSubGrupo
     * 
     */
    public void deleteSubGrupo()
    {
        this._has_subGrupo= false;
    } //-- void deleteSubGrupo() 

    /**
     * Returns the value of field 'codItem'.
     * 
     * @return int
     * @return the value of field 'codItem'.
     */
    public int getCodItem()
    {
        return this._codItem;
    } //-- int getCodItem() 

    /**
     * Returns the value of field 'codLancamento'.
     * 
     * @return int
     * @return the value of field 'codLancamento'.
     */
    public int getCodLancamento()
    {
        return this._codLancamento;
    } //-- int getCodLancamento() 

    /**
     * Returns the value of field 'complementar'.
     * 
     * @return String
     * @return the value of field 'complementar'.
     */
    public java.lang.String getComplementar()
    {
        return this._complementar;
    } //-- java.lang.String getComplementar() 

    /**
     * Returns the value of field 'conta'.
     * 
     * @return long
     * @return the value of field 'conta'.
     */
    public long getConta()
    {
        return this._conta;
    } //-- long getConta() 

    /**
     * Returns the value of field 'cosif'.
     * 
     * @return long
     * @return the value of field 'cosif'.
     */
    public long getCosif()
    {
        return this._cosif;
    } //-- long getCosif() 

    /**
     * Returns the value of field 'digito'.
     * 
     * @return String
     * @return the value of field 'digito'.
     */
    public java.lang.String getDigito()
    {
        return this._digito;
    } //-- java.lang.String getDigito() 

    /**
     * Returns the value of field 'grupo'.
     * 
     * @return int
     * @return the value of field 'grupo'.
     */
    public int getGrupo()
    {
        return this._grupo;
    } //-- int getGrupo() 

    /**
     * Returns the value of field 'nomeConta'.
     * 
     * @return String
     * @return the value of field 'nomeConta'.
     */
    public java.lang.String getNomeConta()
    {
        return this._nomeConta;
    } //-- java.lang.String getNomeConta() 

    /**
     * Returns the value of field 'numParam'.
     * 
     * @return int
     * @return the value of field 'numParam'.
     */
    public int getNumParam()
    {
        return this._numParam;
    } //-- int getNumParam() 

    /**
     * Returns the value of field 'subGrupo'.
     * 
     * @return int
     * @return the value of field 'subGrupo'.
     */
    public int getSubGrupo()
    {
        return this._subGrupo;
    } //-- int getSubGrupo() 

    /**
     * Method hasCodItem
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItem()
    {
        return this._has_codItem;
    } //-- boolean hasCodItem() 

    /**
     * Method hasCodLancamento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodLancamento()
    {
        return this._has_codLancamento;
    } //-- boolean hasCodLancamento() 

    /**
     * Method hasConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasConta()
    {
        return this._has_conta;
    } //-- boolean hasConta() 

    /**
     * Method hasCosif
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCosif()
    {
        return this._has_cosif;
    } //-- boolean hasCosif() 

    /**
     * Method hasGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasGrupo()
    {
        return this._has_grupo;
    } //-- boolean hasGrupo() 

    /**
     * Method hasNumParam
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumParam()
    {
        return this._has_numParam;
    } //-- boolean hasNumParam() 

    /**
     * Method hasSubGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSubGrupo()
    {
        return this._has_subGrupo;
    } //-- boolean hasSubGrupo() 

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
     * Sets the value of field 'codItem'.
     * 
     * @param codItem the value of field 'codItem'.
     */
    public void setCodItem(int codItem)
    {
        this._codItem = codItem;
        this._has_codItem = true;
    } //-- void setCodItem(int) 

    /**
     * Sets the value of field 'codLancamento'.
     * 
     * @param codLancamento the value of field 'codLancamento'.
     */
    public void setCodLancamento(int codLancamento)
    {
        this._codLancamento = codLancamento;
        this._has_codLancamento = true;
    } //-- void setCodLancamento(int) 

    /**
     * Sets the value of field 'complementar'.
     * 
     * @param complementar the value of field 'complementar'.
     */
    public void setComplementar(java.lang.String complementar)
    {
        this._complementar = complementar;
    } //-- void setComplementar(java.lang.String) 

    /**
     * Sets the value of field 'conta'.
     * 
     * @param conta the value of field 'conta'.
     */
    public void setConta(long conta)
    {
        this._conta = conta;
        this._has_conta = true;
    } //-- void setConta(long) 

    /**
     * Sets the value of field 'cosif'.
     * 
     * @param cosif the value of field 'cosif'.
     */
    public void setCosif(long cosif)
    {
        this._cosif = cosif;
        this._has_cosif = true;
    } //-- void setCosif(long) 

    /**
     * Sets the value of field 'digito'.
     * 
     * @param digito the value of field 'digito'.
     */
    public void setDigito(java.lang.String digito)
    {
        this._digito = digito;
    } //-- void setDigito(java.lang.String) 

    /**
     * Sets the value of field 'grupo'.
     * 
     * @param grupo the value of field 'grupo'.
     */
    public void setGrupo(int grupo)
    {
        this._grupo = grupo;
        this._has_grupo = true;
    } //-- void setGrupo(int) 

    /**
     * Sets the value of field 'nomeConta'.
     * 
     * @param nomeConta the value of field 'nomeConta'.
     */
    public void setNomeConta(java.lang.String nomeConta)
    {
        this._nomeConta = nomeConta;
    } //-- void setNomeConta(java.lang.String) 

    /**
     * Sets the value of field 'numParam'.
     * 
     * @param numParam the value of field 'numParam'.
     */
    public void setNumParam(int numParam)
    {
        this._numParam = numParam;
        this._has_numParam = true;
    } //-- void setNumParam(int) 

    /**
     * Sets the value of field 'subGrupo'.
     * 
     * @param subGrupo the value of field 'subGrupo'.
     */
    public void setSubGrupo(int subGrupo)
    {
        this._subGrupo = subGrupo;
        this._has_subGrupo = true;
    } //-- void setSubGrupo(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaExcluirCodLancamento
     */
    public static br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.excluircodlancamento.request.ListaExcluirCodLancamento unmarshal(java.io.Reader) 

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
