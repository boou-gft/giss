/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaContasTpServ.java,v 1.1 2018/06/06 17:23:35 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response;

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
 * Class ListaContasTpServ.
 * 
 * @version $Revision: 1.1 $ $Date: 2018/06/06 17:23:35 $
 */
public class ListaContasTpServ implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _contaContabil
     */
    private java.lang.String _contaContabil;

    /**
     * Field _codigoGrupo
     */
    private int _codigoGrupo = 0;

    /**
     * keeps track of state for field: _codigoGrupo
     */
    private boolean _has_codigoGrupo;

    /**
     * Field _codigoSubgrupo
     */
    private int _codigoSubgrupo = 0;

    /**
     * keeps track of state for field: _codigoSubgrupo
     */
    private boolean _has_codigoSubgrupo;

    /**
     * Field _conta
     */
    private int _conta = 0;

    /**
     * keeps track of state for field: _conta
     */
    private boolean _has_conta;

    /**
     * Field _digConta
     */
    private java.lang.String _digConta;

    /**
     * Field _descRazao
     */
    private java.lang.String _descRazao;

    /**
     * Field _codigoTributo
     */
    private int _codigoTributo = 0;

    /**
     * keeps track of state for field: _codigoTributo
     */
    private boolean _has_codigoTributo;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaContasTpServ() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoGrupo
     * 
     */
    public void deleteCodigoGrupo()
    {
        this._has_codigoGrupo= false;
    } //-- void deleteCodigoGrupo() 

    /**
     * Method deleteCodigoSubgrupo
     * 
     */
    public void deleteCodigoSubgrupo()
    {
        this._has_codigoSubgrupo= false;
    } //-- void deleteCodigoSubgrupo() 

    /**
     * Method deleteCodigoTributo
     * 
     */
    public void deleteCodigoTributo()
    {
        this._has_codigoTributo= false;
    } //-- void deleteCodigoTributo() 

    /**
     * Method deleteConta
     * 
     */
    public void deleteConta()
    {
        this._has_conta= false;
    } //-- void deleteConta() 

    /**
     * Returns the value of field 'codigoGrupo'.
     * 
     * @return int
     * @return the value of field 'codigoGrupo'.
     */
    public int getCodigoGrupo()
    {
        return this._codigoGrupo;
    } //-- int getCodigoGrupo() 

    /**
     * Returns the value of field 'codigoSubgrupo'.
     * 
     * @return int
     * @return the value of field 'codigoSubgrupo'.
     */
    public int getCodigoSubgrupo()
    {
        return this._codigoSubgrupo;
    } //-- int getCodigoSubgrupo() 

    /**
     * Returns the value of field 'codigoTributo'.
     * 
     * @return int
     * @return the value of field 'codigoTributo'.
     */
    public int getCodigoTributo()
    {
        return this._codigoTributo;
    } //-- int getCodigoTributo() 

    /**
     * Returns the value of field 'conta'.
     * 
     * @return int
     * @return the value of field 'conta'.
     */
    public int getConta()
    {
        return this._conta;
    } //-- int getConta() 

    /**
     * Returns the value of field 'contaContabil'.
     * 
     * @return String
     * @return the value of field 'contaContabil'.
     */
    public java.lang.String getContaContabil()
    {
        return this._contaContabil;
    } //-- java.lang.String getContaContabil() 

    /**
     * Returns the value of field 'descRazao'.
     * 
     * @return String
     * @return the value of field 'descRazao'.
     */
    public java.lang.String getDescRazao()
    {
        return this._descRazao;
    } //-- java.lang.String getDescRazao() 

    /**
     * Returns the value of field 'digConta'.
     * 
     * @return String
     * @return the value of field 'digConta'.
     */
    public java.lang.String getDigConta()
    {
        return this._digConta;
    } //-- java.lang.String getDigConta() 

    /**
     * Method hasCodigoGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoGrupo()
    {
        return this._has_codigoGrupo;
    } //-- boolean hasCodigoGrupo() 

    /**
     * Method hasCodigoSubgrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoSubgrupo()
    {
        return this._has_codigoSubgrupo;
    } //-- boolean hasCodigoSubgrupo() 

    /**
     * Method hasCodigoTributo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoTributo()
    {
        return this._has_codigoTributo;
    } //-- boolean hasCodigoTributo() 

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
     * Sets the value of field 'codigoGrupo'.
     * 
     * @param codigoGrupo the value of field 'codigoGrupo'.
     */
    public void setCodigoGrupo(int codigoGrupo)
    {
        this._codigoGrupo = codigoGrupo;
        this._has_codigoGrupo = true;
    } //-- void setCodigoGrupo(int) 

    /**
     * Sets the value of field 'codigoSubgrupo'.
     * 
     * @param codigoSubgrupo the value of field 'codigoSubgrupo'.
     */
    public void setCodigoSubgrupo(int codigoSubgrupo)
    {
        this._codigoSubgrupo = codigoSubgrupo;
        this._has_codigoSubgrupo = true;
    } //-- void setCodigoSubgrupo(int) 

    /**
     * Sets the value of field 'codigoTributo'.
     * 
     * @param codigoTributo the value of field 'codigoTributo'.
     */
    public void setCodigoTributo(int codigoTributo)
    {
        this._codigoTributo = codigoTributo;
        this._has_codigoTributo = true;
    } //-- void setCodigoTributo(int) 

    /**
     * Sets the value of field 'conta'.
     * 
     * @param conta the value of field 'conta'.
     */
    public void setConta(int conta)
    {
        this._conta = conta;
        this._has_conta = true;
    } //-- void setConta(int) 

    /**
     * Sets the value of field 'contaContabil'.
     * 
     * @param contaContabil the value of field 'contaContabil'.
     */
    public void setContaContabil(java.lang.String contaContabil)
    {
        this._contaContabil = contaContabil;
    } //-- void setContaContabil(java.lang.String) 

    /**
     * Sets the value of field 'descRazao'.
     * 
     * @param descRazao the value of field 'descRazao'.
     */
    public void setDescRazao(java.lang.String descRazao)
    {
        this._descRazao = descRazao;
    } //-- void setDescRazao(java.lang.String) 

    /**
     * Sets the value of field 'digConta'.
     * 
     * @param digConta the value of field 'digConta'.
     */
    public void setDigConta(java.lang.String digConta)
    {
        this._digConta = digConta;
    } //-- void setDigConta(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaContasTpServ
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarlistacontastiposervico.response.ListaContasTpServ unmarshal(java.io.Reader) 

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
