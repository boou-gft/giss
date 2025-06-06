/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListarDependenciasNovasResponse.java,v 1.1 2017/04/11 14:12:19 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class ListarDependenciasNovasResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:19 $
 */
public class ListarDependenciasNovasResponse implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

    /**
     * Field _qtdeOcorrencias
     */
    private int _qtdeOcorrencias = 0;

    /**
     * keeps track of state for field: _qtdeOcorrencias
     */
    private boolean _has_qtdeOcorrencias;

    /**
     * Field _ocorrenciasDepNovasList
     */
    private java.util.Vector<Object> _ocorrenciasDepNovasList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarDependenciasNovasResponse() 
     {
        super();
        _ocorrenciasDepNovasList = new java.util.Vector<Object>();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.ListarDependenciasNovasResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method addOcorrenciasDepNovas
     * 
     * 
     * 
     * @param vOcorrenciasDepNovas
     */
    public void addOcorrenciasDepNovas(br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas vOcorrenciasDepNovas)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasDepNovasList.addElement(vOcorrenciasDepNovas);
    } //-- void addOcorrenciasDepNovas(br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas) 

    /**
     * Method addOcorrenciasDepNovas
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasDepNovas
     */
    public void addOcorrenciasDepNovas(int index, br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas vOcorrenciasDepNovas)
        throws java.lang.IndexOutOfBoundsException
    {
        _ocorrenciasDepNovasList.insertElementAt(vOcorrenciasDepNovas, index);
    } //-- void addOcorrenciasDepNovas(int, br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas) 

    /**
     * Method deleteQtdeOcorrencias
     * 
     */
    public void deleteQtdeOcorrencias()
    {
        this._has_qtdeOcorrencias= false;
    } //-- void deleteQtdeOcorrencias() 

    /**
     * Method enumerateOcorrenciasDepNovas
     * 
     * 
     * 
     * @return Enumeration
     */
    public java.util.Enumeration<Object> enumerateOcorrenciasDepNovas()
    {
        return _ocorrenciasDepNovasList.elements();
    } //-- java.util.Enumeration<Object> enumerateOcorrenciasDepNovas() 

    /**
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

    /**
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

    /**
     * Method getOcorrenciasDepNovas
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasDepNovas
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas getOcorrenciasDepNovas(int index)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasDepNovasList.size())) {
            throw new IndexOutOfBoundsException("getOcorrenciasDepNovas: Index value '"+index+"' not in range [0.."+(_ocorrenciasDepNovasList.size() - 1) + "]");
        }
        
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas) _ocorrenciasDepNovasList.elementAt(index);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas getOcorrenciasDepNovas(int) 

    /**
     * Method getOcorrenciasDepNovas
     * 
     * 
     * 
     * @return OcorrenciasDepNovas
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas[] getOcorrenciasDepNovas()
    {
        int size = _ocorrenciasDepNovasList.size();
        br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas[] mArray = new br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas[size];
        for (int index = 0; index < size; index++) {
            mArray[index] = (br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas) _ocorrenciasDepNovasList.elementAt(index);
        }
        return mArray;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas[] getOcorrenciasDepNovas() 

    /**
     * Method getOcorrenciasDepNovasCount
     * 
     * 
     * 
     * @return int
     */
    public int getOcorrenciasDepNovasCount()
    {
        return _ocorrenciasDepNovasList.size();
    } //-- int getOcorrenciasDepNovasCount() 

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
     * Method removeAllOcorrenciasDepNovas
     * 
     */
    public void removeAllOcorrenciasDepNovas()
    {
        _ocorrenciasDepNovasList.removeAllElements();
    } //-- void removeAllOcorrenciasDepNovas() 

    /**
     * Method removeOcorrenciasDepNovas
     * 
     * 
     * 
     * @param index
     * @return OcorrenciasDepNovas
     */
    public br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas removeOcorrenciasDepNovas(int index)
    {
        java.lang.Object obj = _ocorrenciasDepNovasList.elementAt(index);
        _ocorrenciasDepNovasList.removeElementAt(index);
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas) obj;
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas removeOcorrenciasDepNovas(int) 

    /**
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

    /**
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Method setOcorrenciasDepNovas
     * 
     * 
     * 
     * @param index
     * @param vOcorrenciasDepNovas
     */
    public void setOcorrenciasDepNovas(int index, br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas vOcorrenciasDepNovas)
        throws java.lang.IndexOutOfBoundsException
    {
        //-- check bounds for index
        if ((index < 0) || (index >= _ocorrenciasDepNovasList.size())) {
            throw new IndexOutOfBoundsException("setOcorrenciasDepNovas: Index value '"+index+"' not in range [0.." + (_ocorrenciasDepNovasList.size() - 1) + "]");
        }
        _ocorrenciasDepNovasList.setElementAt(vOcorrenciasDepNovas, index);
    } //-- void setOcorrenciasDepNovas(int, br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas) 

    /**
     * Method setOcorrenciasDepNovas
     * 
     * 
     * 
     * @param ocorrenciasDepNovasArray
     */
    public void setOcorrenciasDepNovas(br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas[] ocorrenciasDepNovasArray)
    {
        //-- copy array
        _ocorrenciasDepNovasList.removeAllElements();
        for (int i = 0; i < ocorrenciasDepNovasArray.length; i++) {
            _ocorrenciasDepNovasList.addElement(ocorrenciasDepNovasArray[i]);
        }
    } //-- void setOcorrenciasDepNovas(br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.OcorrenciasDepNovas) 

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
     * @return ListarDependenciasNovasResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.ListarDependenciasNovasResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.ListarDependenciasNovasResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.ListarDependenciasNovasResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciasnovas.response.ListarDependenciasNovasResponse unmarshal(java.io.Reader) 

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
