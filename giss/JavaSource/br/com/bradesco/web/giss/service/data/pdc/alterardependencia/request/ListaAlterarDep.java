/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaAlterarDep.java,v 1.2 2017/07/06 14:31:56 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request;

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
 * Class ListaAlterarDep.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/07/06 14:31:56 $
 */
public class ListaAlterarDep implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codPaa
     */
    private int _codPaa = 0;

    /**
     * keeps track of state for field: _codPaa
     */
    private boolean _has_codPaa;

    /**
     * Field _operacao
     */
    private int _operacao = 0;

    /**
     * keeps track of state for field: _operacao
     */
    private boolean _has_operacao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaAlterarDep() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodPaa
     * 
     */
    public void deleteCodPaa()
    {
        this._has_codPaa= false;
    } //-- void deleteCodPaa() 

    /**
     * Method deleteOperacao
     * 
     */
    public void deleteOperacao()
    {
        this._has_operacao= false;
    } //-- void deleteOperacao() 

    /**
     * Returns the value of field 'codPaa'.
     * 
     * @return int
     * @return the value of field 'codPaa'.
     */
    public int getCodPaa()
    {
        return this._codPaa;
    } //-- int getCodPaa() 

    /**
     * Returns the value of field 'operacao'.
     * 
     * @return int
     * @return the value of field 'operacao'.
     */
    public int getOperacao()
    {
        return this._operacao;
    } //-- int getOperacao() 

    /**
     * Method hasCodPaa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPaa()
    {
        return this._has_codPaa;
    } //-- boolean hasCodPaa() 

    /**
     * Method hasOperacao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasOperacao()
    {
        return this._has_operacao;
    } //-- boolean hasOperacao() 

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
     * Sets the value of field 'codPaa'.
     * 
     * @param codPaa the value of field 'codPaa'.
     */
    public void setCodPaa(int codPaa)
    {
        this._codPaa = codPaa;
        this._has_codPaa = true;
    } //-- void setCodPaa(int) 

    /**
     * Sets the value of field 'operacao'.
     * 
     * @param operacao the value of field 'operacao'.
     */
    public void setOperacao(int operacao)
    {
        this._operacao = operacao;
        this._has_operacao = true;
    } //-- void setOperacao(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaAlterarDep
     */
    public static br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.alterardependencia.request.ListaAlterarDep unmarshal(java.io.Reader) 

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
