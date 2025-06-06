/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: AlterarCodLancamentoRequest.java,v 1.5 2017/06/06 12:46:38 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.alterarcodlancamento.request;

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
 * Class AlterarCodLancamentoRequest.
 * 
 * @version $Revision: 1.5 $ $Date: 2017/06/06 12:46:38 $
 */
public class AlterarCodLancamentoRequest implements java.io.Serializable {


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
     * Field _descConta
     */
    private java.lang.String _descConta;

    /**
     * Field _codItem
     */
    private int _codItem = 0;

    /**
     * keeps track of state for field: _codItem
     */
    private boolean _has_codItem;

    /**
     * Field _numParametro
     */
    private int _numParametro = 0;

    /**
     * keeps track of state for field: _numParametro
     */
    private boolean _has_numParametro;


      //----------------/
     //- Constructors -/
    //----------------/

    public AlterarCodLancamentoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterarcodlancamento.request.AlterarCodLancamentoRequest()


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
     * Method deleteNumParametro
     * 
     */
    public void deleteNumParametro()
    {
        this._has_numParametro= false;
    } //-- void deleteNumParametro() 

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
     * Returns the value of field 'descConta'.
     * 
     * @return String
     * @return the value of field 'descConta'.
     */
    public java.lang.String getDescConta()
    {
        return this._descConta;
    } //-- java.lang.String getDescConta() 

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
     * Returns the value of field 'numParametro'.
     * 
     * @return int
     * @return the value of field 'numParametro'.
     */
    public int getNumParametro()
    {
        return this._numParametro;
    } //-- int getNumParametro() 

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
     * Method hasNumParametro
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumParametro()
    {
        return this._has_numParametro;
    } //-- boolean hasNumParametro() 

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
     * Sets the value of field 'descConta'.
     * 
     * @param descConta the value of field 'descConta'.
     */
    public void setDescConta(java.lang.String descConta)
    {
        this._descConta = descConta;
    } //-- void setDescConta(java.lang.String) 

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
     * Sets the value of field 'numParametro'.
     * 
     * @param numParametro the value of field 'numParametro'.
     */
    public void setNumParametro(int numParametro)
    {
        this._numParametro = numParametro;
        this._has_numParametro = true;
    } //-- void setNumParametro(int) 

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
     * @return AlterarCodLancamentoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.alterarcodlancamento.request.AlterarCodLancamentoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.alterarcodlancamento.request.AlterarCodLancamentoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.alterarcodlancamento.request.AlterarCodLancamentoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterarcodlancamento.request.AlterarCodLancamentoRequest unmarshal(java.io.Reader) 

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
